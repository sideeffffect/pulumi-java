// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs();

    /**
     * The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    @Import(name="backendService", required=true)
      private final Output<String> backendService;

    public Output<String> backendService() {
        return this.backendService;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs(Output<String> backendService) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs() {
        this.backendService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(Output<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public Builder backendService(String backendService) {
            this.backendService = Output.of(Objects.requireNonNull(backendService));
            return this;
        }        public RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs(backendService);
        }
    }
}
