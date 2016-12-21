package exception;

import jdbc.model.ExecuteCommand;
import jdbc.model.ParameterCommand;
import jdbc.model.StatementCreateCommand;

import java.util.Map;

/**
 * 跟踪上下文
 * Created by aude on 2016/12/21.
 */
public class TraceContext {
    private String sql;
    private StatementCreateCommand createCommand;
    private ExecuteCommand executeCommand;
    private Map<Integer, ParameterCommand> parameterCommand;

    @Override
    public String toString() {
        return String.format("sql:{%s} createCommand:{%s} executeCommand:{%s} parameterCommand:{%s}",
                sql,
                createCommand !=null ? createCommand:"",
                executeCommand != null ? executeCommand:"",
                parameterCommand != null ? parameterCommand : "");
    }

    public TraceContext(String sql, StatementCreateCommand createCommand, ExecuteCommand executeCommand, Map<Integer, ParameterCommand> parameterCommand) {
        this.sql = sql;
        this.createCommand = createCommand;
        this.executeCommand = executeCommand;
        this.parameterCommand = parameterCommand;
    }

    public TraceContext(String sql) {
        this.sql = sql;
    }

    public TraceContext() {
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public StatementCreateCommand getCreateCommand() {
        return createCommand;
    }

    public void setCreateCommand(StatementCreateCommand createCommand) {
        this.createCommand = createCommand;
    }

    public ExecuteCommand getExecuteCommand() {
        return executeCommand;
    }

    public void setExecuteCommand(ExecuteCommand executeCommand) {
        this.executeCommand = executeCommand;
    }

    public Map<Integer, ParameterCommand> getParameterCommand() {
        return parameterCommand;
    }

    public void setParameterCommand(Map<Integer, ParameterCommand> parameterCommand) {
        this.parameterCommand = parameterCommand;
    }
}
