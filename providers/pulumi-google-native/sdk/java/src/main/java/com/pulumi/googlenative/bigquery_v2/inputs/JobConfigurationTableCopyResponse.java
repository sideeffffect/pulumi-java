// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.TableReferenceResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JobConfigurationTableCopyResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobConfigurationTableCopyResponse Empty = new JobConfigurationTableCopyResponse();

    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="createDisposition", required=true)
    private String createDisposition;

    public String createDisposition() {
        return this.createDisposition;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Import(name="destinationEncryptionConfiguration", required=true)
    private EncryptionConfigurationResponse destinationEncryptionConfiguration;

    public EncryptionConfigurationResponse destinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration;
    }

    /**
     * [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
     * 
     */
    @Import(name="destinationExpirationTime", required=true)
    private Object destinationExpirationTime;

    public Object destinationExpirationTime() {
        return this.destinationExpirationTime;
    }

    /**
     * [Required] The destination table
     * 
     */
    @Import(name="destinationTable", required=true)
    private TableReferenceResponse destinationTable;

    public TableReferenceResponse destinationTable() {
        return this.destinationTable;
    }

    /**
     * [Optional] Supported operation types in table copy job.
     * 
     */
    @Import(name="operationType", required=true)
    private String operationType;

    public String operationType() {
        return this.operationType;
    }

    /**
     * [Pick one] Source table to copy.
     * 
     */
    @Import(name="sourceTable", required=true)
    private TableReferenceResponse sourceTable;

    public TableReferenceResponse sourceTable() {
        return this.sourceTable;
    }

    /**
     * [Pick one] Source tables to copy.
     * 
     */
    @Import(name="sourceTables", required=true)
    private List<TableReferenceResponse> sourceTables;

    public List<TableReferenceResponse> sourceTables() {
        return this.sourceTables;
    }

    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="writeDisposition", required=true)
    private String writeDisposition;

    public String writeDisposition() {
        return this.writeDisposition;
    }

    private JobConfigurationTableCopyResponse() {}

    private JobConfigurationTableCopyResponse(JobConfigurationTableCopyResponse $) {
        this.createDisposition = $.createDisposition;
        this.destinationEncryptionConfiguration = $.destinationEncryptionConfiguration;
        this.destinationExpirationTime = $.destinationExpirationTime;
        this.destinationTable = $.destinationTable;
        this.operationType = $.operationType;
        this.sourceTable = $.sourceTable;
        this.sourceTables = $.sourceTables;
        this.writeDisposition = $.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConfigurationTableCopyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigurationTableCopyResponse $;

        public Builder() {
            $ = new JobConfigurationTableCopyResponse();
        }

        public Builder(JobConfigurationTableCopyResponse defaults) {
            $ = new JobConfigurationTableCopyResponse(Objects.requireNonNull(defaults));
        }

        public Builder createDisposition(String createDisposition) {
            $.createDisposition = createDisposition;
            return this;
        }

        public Builder destinationEncryptionConfiguration(EncryptionConfigurationResponse destinationEncryptionConfiguration) {
            $.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder destinationExpirationTime(Object destinationExpirationTime) {
            $.destinationExpirationTime = destinationExpirationTime;
            return this;
        }

        public Builder destinationTable(TableReferenceResponse destinationTable) {
            $.destinationTable = destinationTable;
            return this;
        }

        public Builder operationType(String operationType) {
            $.operationType = operationType;
            return this;
        }

        public Builder sourceTable(TableReferenceResponse sourceTable) {
            $.sourceTable = sourceTable;
            return this;
        }

        public Builder sourceTables(List<TableReferenceResponse> sourceTables) {
            $.sourceTables = sourceTables;
            return this;
        }

        public Builder sourceTables(TableReferenceResponse... sourceTables) {
            return sourceTables(List.of(sourceTables));
        }

        public Builder writeDisposition(String writeDisposition) {
            $.writeDisposition = writeDisposition;
            return this;
        }

        public JobConfigurationTableCopyResponse build() {
            $.createDisposition = Objects.requireNonNull($.createDisposition, "expected parameter 'createDisposition' to be non-null");
            $.destinationEncryptionConfiguration = Objects.requireNonNull($.destinationEncryptionConfiguration, "expected parameter 'destinationEncryptionConfiguration' to be non-null");
            $.destinationExpirationTime = Objects.requireNonNull($.destinationExpirationTime, "expected parameter 'destinationExpirationTime' to be non-null");
            $.destinationTable = Objects.requireNonNull($.destinationTable, "expected parameter 'destinationTable' to be non-null");
            $.operationType = Objects.requireNonNull($.operationType, "expected parameter 'operationType' to be non-null");
            $.sourceTable = Objects.requireNonNull($.sourceTable, "expected parameter 'sourceTable' to be non-null");
            $.sourceTables = Objects.requireNonNull($.sourceTables, "expected parameter 'sourceTables' to be non-null");
            $.writeDisposition = Objects.requireNonNull($.writeDisposition, "expected parameter 'writeDisposition' to be non-null");
            return $;
        }
    }

}
