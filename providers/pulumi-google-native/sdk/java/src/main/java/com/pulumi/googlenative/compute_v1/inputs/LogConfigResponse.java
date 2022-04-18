// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.LogConfigCloudAuditOptionsResponse;
import com.pulumi.googlenative.compute_v1.inputs.LogConfigCounterOptionsResponse;
import com.pulumi.googlenative.compute_v1.inputs.LogConfigDataAccessOptionsResponse;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogConfigResponse Empty = new LogConfigResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="cloudAudit", required=true)
      private final LogConfigCloudAuditOptionsResponse cloudAudit;

    public LogConfigCloudAuditOptionsResponse cloudAudit() {
        return this.cloudAudit;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="counter", required=true)
      private final LogConfigCounterOptionsResponse counter;

    public LogConfigCounterOptionsResponse counter() {
        return this.counter;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="dataAccess", required=true)
      private final LogConfigDataAccessOptionsResponse dataAccess;

    public LogConfigDataAccessOptionsResponse dataAccess() {
        return this.dataAccess;
    }

    public LogConfigResponse(
        LogConfigCloudAuditOptionsResponse cloudAudit,
        LogConfigCounterOptionsResponse counter,
        LogConfigDataAccessOptionsResponse dataAccess) {
        this.cloudAudit = Objects.requireNonNull(cloudAudit, "expected parameter 'cloudAudit' to be non-null");
        this.counter = Objects.requireNonNull(counter, "expected parameter 'counter' to be non-null");
        this.dataAccess = Objects.requireNonNull(dataAccess, "expected parameter 'dataAccess' to be non-null");
    }

    private LogConfigResponse() {
        this.cloudAudit = null;
        this.counter = null;
        this.dataAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigCloudAuditOptionsResponse cloudAudit;
        private LogConfigCounterOptionsResponse counter;
        private LogConfigDataAccessOptionsResponse dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder cloudAudit(LogConfigCloudAuditOptionsResponse cloudAudit) {
            this.cloudAudit = Objects.requireNonNull(cloudAudit);
            return this;
        }
        public Builder counter(LogConfigCounterOptionsResponse counter) {
            this.counter = Objects.requireNonNull(counter);
            return this;
        }
        public Builder dataAccess(LogConfigDataAccessOptionsResponse dataAccess) {
            this.dataAccess = Objects.requireNonNull(dataAccess);
            return this;
        }        public LogConfigResponse build() {
            return new LogConfigResponse(cloudAudit, counter, dataAccess);
        }
    }
}
