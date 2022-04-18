// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Fields for tracking refresh job on the share or container.
 * 
 */
public final class RefreshDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RefreshDetailsResponse Empty = new RefreshDetailsResponse();

    /**
     * Indicates the relative path of the error xml for the last refresh job on this particular share or container, if any. This could be a failed job or a successful job.
     * 
     */
    @Import(name="errorManifestFile")
      private final @Nullable String errorManifestFile;

    public Optional<String> errorManifestFile() {
        return this.errorManifestFile == null ? Optional.empty() : Optional.ofNullable(this.errorManifestFile);
    }

    /**
     * If a refresh job is currently in progress on this share or container, this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     * 
     */
    @Import(name="inProgressRefreshJobId")
      private final @Nullable String inProgressRefreshJobId;

    public Optional<String> inProgressRefreshJobId() {
        return this.inProgressRefreshJobId == null ? Optional.empty() : Optional.ofNullable(this.inProgressRefreshJobId);
    }

    /**
     * Indicates the completed time for the last refresh job on this particular share or container, if any.This could be a failed job or a successful job.
     * 
     */
    @Import(name="lastCompletedRefreshJobTimeInUTC")
      private final @Nullable String lastCompletedRefreshJobTimeInUTC;

    public Optional<String> lastCompletedRefreshJobTimeInUTC() {
        return this.lastCompletedRefreshJobTimeInUTC == null ? Optional.empty() : Optional.ofNullable(this.lastCompletedRefreshJobTimeInUTC);
    }

    /**
     * Indicates the id of the last refresh job on this particular share or container,if any. This could be a failed job or a successful job.
     * 
     */
    @Import(name="lastJob")
      private final @Nullable String lastJob;

    public Optional<String> lastJob() {
        return this.lastJob == null ? Optional.empty() : Optional.ofNullable(this.lastJob);
    }

    public RefreshDetailsResponse(
        @Nullable String errorManifestFile,
        @Nullable String inProgressRefreshJobId,
        @Nullable String lastCompletedRefreshJobTimeInUTC,
        @Nullable String lastJob) {
        this.errorManifestFile = errorManifestFile;
        this.inProgressRefreshJobId = inProgressRefreshJobId;
        this.lastCompletedRefreshJobTimeInUTC = lastCompletedRefreshJobTimeInUTC;
        this.lastJob = lastJob;
    }

    private RefreshDetailsResponse() {
        this.errorManifestFile = null;
        this.inProgressRefreshJobId = null;
        this.lastCompletedRefreshJobTimeInUTC = null;
        this.lastJob = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RefreshDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorManifestFile;
        private @Nullable String inProgressRefreshJobId;
        private @Nullable String lastCompletedRefreshJobTimeInUTC;
        private @Nullable String lastJob;

        public Builder() {
    	      // Empty
        }

        public Builder(RefreshDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorManifestFile = defaults.errorManifestFile;
    	      this.inProgressRefreshJobId = defaults.inProgressRefreshJobId;
    	      this.lastCompletedRefreshJobTimeInUTC = defaults.lastCompletedRefreshJobTimeInUTC;
    	      this.lastJob = defaults.lastJob;
        }

        public Builder errorManifestFile(@Nullable String errorManifestFile) {
            this.errorManifestFile = errorManifestFile;
            return this;
        }
        public Builder inProgressRefreshJobId(@Nullable String inProgressRefreshJobId) {
            this.inProgressRefreshJobId = inProgressRefreshJobId;
            return this;
        }
        public Builder lastCompletedRefreshJobTimeInUTC(@Nullable String lastCompletedRefreshJobTimeInUTC) {
            this.lastCompletedRefreshJobTimeInUTC = lastCompletedRefreshJobTimeInUTC;
            return this;
        }
        public Builder lastJob(@Nullable String lastJob) {
            this.lastJob = lastJob;
            return this;
        }        public RefreshDetailsResponse build() {
            return new RefreshDetailsResponse(errorManifestFile, inProgressRefreshJobId, lastCompletedRefreshJobTimeInUTC, lastJob);
        }
    }
}
