package com.shuzijun.leetcode.plugin.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.shuzijun.leetcode.plugin.utils.DataKeys;
import com.shuzijun.leetcode.plugin.window.WindowFactory;

import javax.swing.*;

/**
 * @author shuzijun
 */
public class FindAction extends ToggleAction {


    @Override
    public boolean isSelected(AnActionEvent anActionEvent) {
        JPanel panel = WindowFactory.getDataContext(anActionEvent.getProject()).getData(DataKeys.LEETCODE_PROJECTS_TERRFIND);
        if (panel == null) {
            return false;
        }
        return panel.isVisible();
    }

    @Override
    public void setSelected(AnActionEvent anActionEvent, boolean b) {
        JPanel panel = WindowFactory.getDataContext(anActionEvent.getProject()).getData(DataKeys.LEETCODE_PROJECTS_TERRFIND);
        if (panel == null) {
            return;
        }
        panel.setVisible(b);
    }

}
