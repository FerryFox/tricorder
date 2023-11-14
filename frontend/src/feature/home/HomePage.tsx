import {Button, Typography} from "@mui/material";
import {useState} from "react";
import axios from "axios";

export default function HomePage()
{
    const callApi = () =>
    {
        axios.get("/api/gpt/test");
    }

    const [count, setCount] = useState(0);
    return (
        <>
            <Typography>
                Home Page
            </Typography>
            <Button variant={"contained"} onClick={() => setCount(count+1)}>
                Add
            </Button>
            <Typography>
                {count}
            </Typography>

            <Button onClick={callApi}>
                fire api call
            </Button>
        </>
    );
}