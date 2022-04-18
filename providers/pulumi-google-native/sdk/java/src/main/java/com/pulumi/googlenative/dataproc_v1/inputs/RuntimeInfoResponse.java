// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Runtime information about workload execution.
 * 
 */
public final class RuntimeInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuntimeInfoResponse Empty = new RuntimeInfoResponse();

    /**
     * A URI pointing to the location of the diagnostics tarball.
     * 
     */
    @Import(name="diagnosticOutputUri", required=true)
      private final String diagnosticOutputUri;

    public String diagnosticOutputUri() {
        return this.diagnosticOutputUri;
    }

    /**
     * Map of remote access endpoints (such as web interfaces and APIs) to their URIs.
     * 
     */
    @Import(name="endpoints", required=true)
      private final Map<String,String> endpoints;

    public Map<String,String> endpoints() {
        return this.endpoints;
    }

    /**
     * A URI pointing to the location of the stdout and stderr of the workload.
     * 
     */
    @Import(name="outputUri", required=true)
      private final String outputUri;

    public String outputUri() {
        return this.outputUri;
    }

    public RuntimeInfoResponse(
        String diagnosticOutputUri,
        Map<String,String> endpoints,
        String outputUri) {
        this.diagnosticOutputUri = Objects.requireNonNull(diagnosticOutputUri, "expected parameter 'diagnosticOutputUri' to be non-null");
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.outputUri = Objects.requireNonNull(outputUri, "expected parameter 'outputUri' to be non-null");
    }

    private RuntimeInfoResponse() {
        this.diagnosticOutputUri = null;
        this.endpoints = Map.of();
        this.outputUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diagnosticOutputUri;
        private Map<String,String> endpoints;
        private String outputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticOutputUri = defaults.diagnosticOutputUri;
    	      this.endpoints = defaults.endpoints;
    	      this.outputUri = defaults.outputUri;
        }

        public Builder diagnosticOutputUri(String diagnosticOutputUri) {
            this.diagnosticOutputUri = Objects.requireNonNull(diagnosticOutputUri);
            return this;
        }
        public Builder endpoints(Map<String,String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder outputUri(String outputUri) {
            this.outputUri = Objects.requireNonNull(outputUri);
            return this;
        }        public RuntimeInfoResponse build() {
            return new RuntimeInfoResponse(diagnosticOutputUri, endpoints, outputUri);
        }
    }
}
