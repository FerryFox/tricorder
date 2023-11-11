import {Button, Typography} from "@mui/material";
import {useState} from "react";

export default function HomePage() {
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
        </>
    );
}