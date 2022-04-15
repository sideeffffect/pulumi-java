// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GetMeshSpecEgressFilter;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetMeshSpec extends io.pulumi.resources.InvokeArgs {

    public static final GetMeshSpec Empty = new GetMeshSpec();

    /**
     * The egress filter rules for the service mesh.
     * 
     */
    @Import(name="egressFilters", required=true)
      private final List<GetMeshSpecEgressFilter> egressFilters;

    public List<GetMeshSpecEgressFilter> egressFilters() {
        return this.egressFilters;
    }

    public GetMeshSpec(List<GetMeshSpecEgressFilter> egressFilters) {
        this.egressFilters = Objects.requireNonNull(egressFilters, "expected parameter 'egressFilters' to be non-null");
    }

    private GetMeshSpec() {
        this.egressFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetMeshSpecEgressFilter> egressFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFilters = defaults.egressFilters;
        }

        public Builder egressFilters(List<GetMeshSpecEgressFilter> egressFilters) {
            this.egressFilters = Objects.requireNonNull(egressFilters);
            return this;
        }
        public Builder egressFilters(GetMeshSpecEgressFilter... egressFilters) {
            return egressFilters(List.of(egressFilters));
        }        public GetMeshSpec build() {
            return new GetMeshSpec(egressFilters);
        }
    }
}
