// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy that specifies how requests intended for the route's backends are shadowed to a separate mirrored backend service. The load balancer doesn't wait for responses from the shadow service. Before sending traffic to the shadow service, the host or authority header is suffixed with -shadow.
 * 
 */
public final class RequestMirrorPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestMirrorPolicyArgs Empty = new RequestMirrorPolicyArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @InputImport(name="backendService")
      private final @Nullable Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService == null ? Input.empty() : this.backendService;
    }

    public RequestMirrorPolicyArgs(@Nullable Input<String> backendService) {
        this.backendService = backendService;
    }

    private RequestMirrorPolicyArgs() {
        this.backendService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMirrorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMirrorPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(@Nullable Input<String> backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder backendService(@Nullable String backendService) {
            this.backendService = Input.ofNullable(backendService);
            return this;
        }
        public RequestMirrorPolicyArgs build() {
            return new RequestMirrorPolicyArgs(backendService);
        }
    }
}
