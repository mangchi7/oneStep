import React, { useState } from 'react';
import axios from 'axios';
import BoardTable from './BoardTable';

const Board = () => {
	const [boards, setBoards] = useState([]);
	const loadApi = () => {
		axios
			.get('http://localhost:8080/api/board')
			.then((Response) => {
				setBoards(Response.data);
				//console.log(Response.data);
			})
			.catch((Error) => {
				console.log(Error);
			});
	};
	if (boards.length > 0) {
		return (
			<table className="testTable">
				<tbody>
					<tr>
						<th>NO</th>
						<th>으아</th>
						<th>으악2</th>
					</tr>
					{boards.map((board) => (
						<BoardTable key={board.id} board={board} />
					))}
				</tbody>
			</table>
		);
	} else {
		return (
			<a className="App-link" onClick={loadApi} href="#" rel="noopener noreferrer">
				눌러줘
			</a>
		);
	}
};

export default Board;
