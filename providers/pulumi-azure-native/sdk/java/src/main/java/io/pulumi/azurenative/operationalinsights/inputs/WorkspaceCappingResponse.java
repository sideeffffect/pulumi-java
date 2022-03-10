// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The daily volume cap for ingestion.
 * 
 */
public final class WorkspaceCappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceCappingResponse Empty = new WorkspaceCappingResponse();

    /**
     * The workspace daily quota for ingestion.
     * 
     */
    @InputImport(name="dailyQuotaGb")
      private final @Nullable Double dailyQuotaGb;

    public Optional<Double> getDailyQuotaGb() {
        return this.dailyQuotaGb == null ? Optional.empty() : Optional.ofNullable(this.dailyQuotaGb);
    }

    /**
     * The status of data ingestion for this workspace.
     * 
     */
    @InputImport(name="dataIngestionStatus", required=true)
      private final String dataIngestionStatus;

    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    /**
     * The time when the quota will be rest.
     * 
     */
    @InputImport(name="quotaNextResetTime", required=true)
      private final String quotaNextResetTime;

    public String getQuotaNextResetTime() {
        return this.quotaNextResetTime;
    }

    public WorkspaceCappingResponse(
        @Nullable Double dailyQuotaGb,
        String dataIngestionStatus,
        String quotaNextResetTime) {
        this.dailyQuotaGb = dailyQuotaGb;
        this.dataIngestionStatus = Objects.requireNonNull(dataIngestionStatus, "expected parameter 'dataIngestionStatus' to be non-null");
        this.quotaNextResetTime = Objects.requireNonNull(quotaNextResetTime, "expected parameter 'quotaNextResetTime' to be non-null");
    }

    private WorkspaceCappingResponse() {
        this.dailyQuotaGb = null;
        this.dataIngestionStatus = null;
        this.quotaNextResetTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double dailyQuotaGb;
        private String dataIngestionStatus;
        private String quotaNextResetTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyQuotaGb = defaults.dailyQuotaGb;
    	      this.dataIngestionStatus = defaults.dataIngestionStatus;
    	      this.quotaNextResetTime = defaults.quotaNextResetTime;
        }

        public Builder dailyQuotaGb(@Nullable Double dailyQuotaGb) {
            this.dailyQuotaGb = dailyQuotaGb;
            return this;
        }

        public Builder dataIngestionStatus(String dataIngestionStatus) {
            this.dataIngestionStatus = Objects.requireNonNull(dataIngestionStatus);
            return this;
        }

        public Builder quotaNextResetTime(String quotaNextResetTime) {
            this.quotaNextResetTime = Objects.requireNonNull(quotaNextResetTime);
            return this;
        }
        public WorkspaceCappingResponse build() {
            return new WorkspaceCappingResponse(dailyQuotaGb, dataIngestionStatus, quotaNextResetTime);
        }
    }
}
