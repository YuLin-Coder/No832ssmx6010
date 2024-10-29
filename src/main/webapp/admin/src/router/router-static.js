import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qiantai from '@/views/modules/qiantai/list'
    import jingdianmeishi from '@/views/modules/jingdianmeishi/list'
    import discusszhusuxinxi from '@/views/modules/discusszhusuxinxi/list'
    import jingdianxinxi from '@/views/modules/jingdianxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import discussjingdianmeishi from '@/views/modules/discussjingdianmeishi/list'
    import yaoqingxinxi from '@/views/modules/yaoqingxinxi/list'
    import zhusuxinxi from '@/views/modules/zhusuxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussjingdianxinxi from '@/views/modules/discussjingdianxinxi/list'
    import messages from '@/views/modules/messages/list'
    import luxianguihua from '@/views/modules/luxianguihua/list'
    import orders from '@/views/modules/orders/list'
    import discussluxianguihua from '@/views/modules/discussluxianguihua/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/qiantai',
        name: '前台',
        component: qiantai
      }
          ,{
	path: '/jingdianmeishi',
        name: '景点美食',
        component: jingdianmeishi
      }
          ,{
	path: '/discusszhusuxinxi',
        name: '住宿信息评论',
        component: discusszhusuxinxi
      }
          ,{
	path: '/jingdianxinxi',
        name: '景点信息',
        component: jingdianxinxi
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/discussjingdianmeishi',
        name: '景点美食评论',
        component: discussjingdianmeishi
      }
          ,{
	path: '/yaoqingxinxi',
        name: '邀请信息',
        component: yaoqingxinxi
      }
          ,{
	path: '/zhusuxinxi',
        name: '住宿信息',
        component: zhusuxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/discussjingdianxinxi',
        name: '景点信息评论',
        component: discussjingdianxinxi
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/luxianguihua',
        name: '路线规划',
        component: luxianguihua
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/discussluxianguihua',
        name: '路线规划评论',
        component: discussluxianguihua
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
