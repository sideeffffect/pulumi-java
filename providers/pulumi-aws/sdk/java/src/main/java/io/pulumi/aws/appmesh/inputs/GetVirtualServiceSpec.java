// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GetVirtualServiceSpecProvider;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetVirtualServiceSpec extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualServiceSpec Empty = new GetVirtualServiceSpec();

    /**
     * The App Mesh object that is acting as the provider for a virtual service.
     * 
     */
    @InputImport(name="providers", required=true)
      private final List<GetVirtualServiceSpecProvider> providers;

    public List<GetVirtualServiceSpecProvider> getProviders() {
        return this.providers;
    }

    public GetVirtualServiceSpec(List<GetVirtualServiceSpecProvider> providers) {
        this.providers = Objects.requireNonNull(providers, "expected parameter 'providers' to be non-null");
    }

    private GetVirtualServiceSpec() {
        this.providers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetVirtualServiceSpecProvider> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providers = defaults.providers;
        }

        public Builder providers(List<GetVirtualServiceSpecProvider> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public GetVirtualServiceSpec build() {
            return new GetVirtualServiceSpec(providers);
        }
    }
}
