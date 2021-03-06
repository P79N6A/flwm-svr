import './App.css';
import React, { Component } from 'react';
import { Layout, Menu } from 'antd';
import { Link} from 'react-router-dom';
import { BrowserRouter,Route,Redirect,Switch } from 'react-router-dom';
import Home from './flwm/Home';
import Search from './flwm/Search';
import Detail from './flwm/Detail'
import  Login from './flwm/Login'
const { Header, Content, Footer } = Layout;

const BaseLayout = ()=>(
  <Layout>
    <Header style={{ position: 'fixed', zIndex: 1, width: '100%' }}>
      <div className="logo"/>
      <Menu
        theme="dark"
        mode="horizontal"
        defaultSelectedKeys={['1']}
        style={{ lineHeight: '64px' }}
      >
        <Menu.Item key="1"><Link to="/index">首页</Link></Menu.Item>
        <Menu.Item key="2"><Link to="/search">查找</Link></Menu.Item>
        <Menu.Item key="3"><Link to="/mine">我的</Link></Menu.Item>
      </Menu>
    </Header>


    <Content style={{ padding: '0 50px', marginTop: 64 }}>
      <div style={{ background: '#fff', padding: 24, minHeight: 480 }}>
        <Switch>
          <Route path="/" exact component={Home}/>
          <Route path="/index" component={Home}/>
          <Route path="/search" exact component={Search}/>
          <Route path="/search/detail" component={Detail}/>
          <Route path="/login" component={Login}/>
          <Redirect to="/index"/>
        </Switch>
      </div>
    </Content>
    <Footer style={{ textAlign: 'center' }}>
      版权所有,盗版必究 | 联系邮箱:zhoupj1987@163.com
    </Footer>
  </Layout>

)


class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <BaseLayout/>
      </BrowserRouter>
    );
  }
}

export default App;
