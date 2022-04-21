// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cassandra.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TableColumn extends com.pulumi.resources.InvokeArgs {

    public static final TableColumn Empty = new TableColumn();

    @Import(name="columnName", required=true)
    private String columnName;

    public String columnName() {
        return this.columnName;
    }

    @Import(name="columnType", required=true)
    private String columnType;

    public String columnType() {
        return this.columnType;
    }

    private TableColumn() {}

    private TableColumn(TableColumn $) {
        this.columnName = $.columnName;
        this.columnType = $.columnType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableColumn $;

        public Builder() {
            $ = new TableColumn();
        }

        public Builder(TableColumn defaults) {
            $ = new TableColumn(Objects.requireNonNull(defaults));
        }

        public Builder columnName(String columnName) {
            $.columnName = columnName;
            return this;
        }

        public Builder columnType(String columnType) {
            $.columnType = columnType;
            return this;
        }

        public TableColumn build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.columnType = Objects.requireNonNull($.columnType, "expected parameter 'columnType' to be non-null");
            return $;
        }
    }

}
