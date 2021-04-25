import logo from './logo.svg';
import './App.css';
import Board from './components/Board';

function App() {
	return (
		<div className="App">
			<header className="App-header">
				<img src={logo} className="App-logo" alt="logo" />
				<p>디자인 따위 없다.</p>
				<Board />
			</header>
		</div>
	);
}

export default App;
