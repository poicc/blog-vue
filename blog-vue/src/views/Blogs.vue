<template>
  <div class="m-container">
    <Header></Header>
    <div class="block">
      <el-timeline>
        <el-timeline-item
          :timestamp="blog.created"
          placement="top"
          v-for="(blog, index) in blogs"
          :key="index"
        >
          <el-card>
            <h4>
              <router-link
                :to="{ name: 'BlogDetail', params: { blogId: blog.id } }"
                >{{ blog.title }}</router-link
              >
            </h4>
            <p>{{ blog.description }}</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>

      <el-pagination
        class="m-page"
        background
        layout="prev,pager,next"
        :current-page="currentPage"
        :page-size="pageSize"
        :total="total"
        @current-change="page"
      >
      </el-pagination>
    </div>
  </div>
</template>

<script>
import Header from "../components/Header";

export default {
  name: "Blogs.vue",
  components: { Header },
  data() {
    return {
      blogs: {},
      currentPage: 1,
      total: 0,
      pageSize: 5,
    };
  },
  methods: {
    page(currentPage) {
      const _this = this;
      _this.$axios.get("/blogs?currentPage=" + currentPage).then(res => {
        console.log(res);
        let data = res.data.data.records
        for(let i in data) {
            data[i].created = data[i].created.slice(0,10)+" "+data[i].created.slice(12,16)
        }
        _this.blogs = data;
        _this.currentPage = res.data.data.current;
        _this.total = res.data.data.total;
        _this.pageSize = res.data.data.size;
      });
    },
  },
  created() {
    this.page(1);
  },
};
</script>

<style scoped>
.m-page {
  margin: 0 auto;
  text-align: center;
}
</style>
