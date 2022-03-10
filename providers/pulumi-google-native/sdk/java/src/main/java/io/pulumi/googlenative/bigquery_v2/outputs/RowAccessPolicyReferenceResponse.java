// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RowAccessPolicyReferenceResponse {
    /**
     * [Required] The ID of the dataset containing this row access policy.
     * 
     */
    private final String datasetId;
    /**
     * [Required] The ID of the row access policy. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    private final String policyId;
    /**
     * [Required] The ID of the project containing this row access policy.
     * 
     */
    private final String project;
    /**
     * [Required] The ID of the table containing this row access policy.
     * 
     */
    private final String tableId;

    @OutputCustomType.Constructor
    private RowAccessPolicyReferenceResponse(
        @OutputCustomType.Parameter("datasetId") String datasetId,
        @OutputCustomType.Parameter("policyId") String policyId,
        @OutputCustomType.Parameter("project") String project,
        @OutputCustomType.Parameter("tableId") String tableId) {
        this.datasetId = datasetId;
        this.policyId = policyId;
        this.project = project;
        this.tableId = tableId;
    }

    /**
     * [Required] The ID of the dataset containing this row access policy.
     * 
    */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * [Required] The ID of the row access policy. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
    */
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * [Required] The ID of the project containing this row access policy.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * [Required] The ID of the table containing this row access policy.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowAccessPolicyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String policyId;
        private String project;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(RowAccessPolicyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.policyId = defaults.policyId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public RowAccessPolicyReferenceResponse build() {
            return new RowAccessPolicyReferenceResponse(datasetId, policyId, project, tableId);
        }
    }
}
