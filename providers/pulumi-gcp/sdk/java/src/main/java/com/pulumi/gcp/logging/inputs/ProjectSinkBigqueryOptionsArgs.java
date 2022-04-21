// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ProjectSinkBigqueryOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSinkBigqueryOptionsArgs Empty = new ProjectSinkBigqueryOptionsArgs();

    /**
     * Whether to use [BigQuery&#39;s partition tables](https://cloud.google.com/bigquery/docs/partitioned-tables).
     * By default, Logging creates dated tables based on the log entries&#39; timestamps, e.g. syslog_20170523. With partitioned
     * tables the date suffix is no longer present and [special query syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
     */
    @Import(name="usePartitionedTables", required=true)
    private Output<Boolean> usePartitionedTables;

    public Output<Boolean> usePartitionedTables() {
        return this.usePartitionedTables;
    }

    private ProjectSinkBigqueryOptionsArgs() {}

    private ProjectSinkBigqueryOptionsArgs(ProjectSinkBigqueryOptionsArgs $) {
        this.usePartitionedTables = $.usePartitionedTables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSinkBigqueryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSinkBigqueryOptionsArgs $;

        public Builder() {
            $ = new ProjectSinkBigqueryOptionsArgs();
        }

        public Builder(ProjectSinkBigqueryOptionsArgs defaults) {
            $ = new ProjectSinkBigqueryOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder usePartitionedTables(Output<Boolean> usePartitionedTables) {
            $.usePartitionedTables = usePartitionedTables;
            return this;
        }

        public Builder usePartitionedTables(Boolean usePartitionedTables) {
            return usePartitionedTables(Output.of(usePartitionedTables));
        }

        public ProjectSinkBigqueryOptionsArgs build() {
            $.usePartitionedTables = Objects.requireNonNull($.usePartitionedTables, "expected parameter 'usePartitionedTables' to be non-null");
            return $;
        }
    }

}
