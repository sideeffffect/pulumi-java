// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.DatabaseTableResponse;
import com.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Output of the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlTaskOutputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetUserTablesSqlTaskOutputResponse Empty = new GetUserTablesSqlTaskOutputResponse();

    /**
     * Mapping from database name to list of tables
     * 
     */
    @Import(name="databasesToTables", required=true)
    private Map<String,List<DatabaseTableResponse>> databasesToTables;

    public Map<String,List<DatabaseTableResponse>> databasesToTables() {
        return this.databasesToTables;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Validation errors
     * 
     */
    @Import(name="validationErrors", required=true)
    private List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> validationErrors() {
        return this.validationErrors;
    }

    private GetUserTablesSqlTaskOutputResponse() {}

    private GetUserTablesSqlTaskOutputResponse(GetUserTablesSqlTaskOutputResponse $) {
        this.databasesToTables = $.databasesToTables;
        this.id = $.id;
        this.validationErrors = $.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserTablesSqlTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserTablesSqlTaskOutputResponse $;

        public Builder() {
            $ = new GetUserTablesSqlTaskOutputResponse();
        }

        public Builder(GetUserTablesSqlTaskOutputResponse defaults) {
            $ = new GetUserTablesSqlTaskOutputResponse(Objects.requireNonNull(defaults));
        }

        public Builder databasesToTables(Map<String,List<DatabaseTableResponse>> databasesToTables) {
            $.databasesToTables = databasesToTables;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            $.validationErrors = validationErrors;
            return this;
        }

        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }

        public GetUserTablesSqlTaskOutputResponse build() {
            $.databasesToTables = Objects.requireNonNull($.databasesToTables, "expected parameter 'databasesToTables' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.validationErrors = Objects.requireNonNull($.validationErrors, "expected parameter 'validationErrors' to be non-null");
            return $;
        }
    }

}
