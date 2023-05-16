<template>

    <v-data-table
        :headers="headers"
        :items="usersView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'UsersViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            usersView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/usersViews'))

            temp.data._embedded.usersViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.usersView = temp.data._embedded.usersViews;
        },
        methods: {
        }
    }
</script>

