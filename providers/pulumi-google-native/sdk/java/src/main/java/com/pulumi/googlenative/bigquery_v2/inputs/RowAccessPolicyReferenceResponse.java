// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RowAccessPolicyReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RowAccessPolicyReferenceResponse Empty = new RowAccessPolicyReferenceResponse();

    /**
     * [Required] The ID of the dataset containing this row access policy.
     * 
     */
    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    /**
     * [Required] The ID of the row access policy. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    @Import(name="policyId", required=true)
    private String policyId;

    public String policyId() {
        return this.policyId;
    }

    /**
     * [Required] The ID of the project containing this row access policy.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    public String project() {
        return this.project;
    }

    /**
     * [Required] The ID of the table containing this row access policy.
     * 
     */
    @Import(name="tableId", required=true)
    private String tableId;

    public String tableId() {
        return this.tableId;
    }

    private RowAccessPolicyReferenceResponse() {}

    private RowAccessPolicyReferenceResponse(RowAccessPolicyReferenceResponse $) {
        this.datasetId = $.datasetId;
        this.policyId = $.policyId;
        this.project = $.project;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RowAccessPolicyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RowAccessPolicyReferenceResponse $;

        public Builder() {
            $ = new RowAccessPolicyReferenceResponse();
        }

        public Builder(RowAccessPolicyReferenceResponse defaults) {
            $ = new RowAccessPolicyReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder policyId(String policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public Builder tableId(String tableId) {
            $.tableId = tableId;
            return this;
        }

        public RowAccessPolicyReferenceResponse build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
