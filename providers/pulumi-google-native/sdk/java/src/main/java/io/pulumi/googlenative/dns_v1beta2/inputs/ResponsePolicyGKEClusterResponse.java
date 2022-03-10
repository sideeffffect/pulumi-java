// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResponsePolicyGKEClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResponsePolicyGKEClusterResponse Empty = new ResponsePolicyGKEClusterResponse();

    /**
     * The resource name of the cluster to bind this response policy to. This should be specified in the format like: projects/*{@literal /}locations/*{@literal /}clusters/*. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
     * 
     */
    @InputImport(name="gkeClusterName", required=true)
      private final String gkeClusterName;

    public String getGkeClusterName() {
        return this.gkeClusterName;
    }

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    public ResponsePolicyGKEClusterResponse(
        String gkeClusterName,
        String kind) {
        this.gkeClusterName = Objects.requireNonNull(gkeClusterName, "expected parameter 'gkeClusterName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private ResponsePolicyGKEClusterResponse() {
        this.gkeClusterName = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePolicyGKEClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gkeClusterName;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePolicyGKEClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterName = defaults.gkeClusterName;
    	      this.kind = defaults.kind;
        }

        public Builder gkeClusterName(String gkeClusterName) {
            this.gkeClusterName = Objects.requireNonNull(gkeClusterName);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public ResponsePolicyGKEClusterResponse build() {
            return new ResponsePolicyGKEClusterResponse(gkeClusterName, kind);
        }
    }
}
