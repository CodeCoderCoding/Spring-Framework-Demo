package com.supremepole.springconditional;

/**
 * @author CodeCoderCoding
 */
public class LinuxListServiceImpl implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
