// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs();

    /**
     * The dataset ID of the table.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs() {}

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs $;

        public Builder() {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs();
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs defaults) {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
