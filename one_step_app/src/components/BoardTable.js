import React from 'react';

const BoardTable = (row) => {
	console.log(row);
	return (
		<tr>
			<td>{row.board.id}</td>
			<td>{row.board.title}</td>
			<td>{row.board.insertName}</td>
		</tr>
	);
};

export default BoardTable;
