import axios from 'axios';

const API = 'http://localhost:8080/api/board';

const board = () => {
	return axios.get(API);
};

export default board;
