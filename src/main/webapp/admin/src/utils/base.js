const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmx6010/",
            name: "ssmx6010",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmx6010/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "亿互游在线平台网站"
        } 
    }
}
export default base
