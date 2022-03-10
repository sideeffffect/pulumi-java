// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultRouteTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultRouteTableArgs Empty = new DefaultRouteTableArgs();

    /**
     * ID of the default route table.
     * 
     */
    @InputImport(name="defaultRouteTableId", required=true)
      private final Input<String> defaultRouteTableId;

    public Input<String> getDefaultRouteTableId() {
        return this.defaultRouteTableId;
    }

    /**
     * List of virtual gateways for propagation.
     * 
     */
    @InputImport(name="propagatingVgws")
      private final @Nullable Input<List<String>> propagatingVgws;

    public Input<List<String>> getPropagatingVgws() {
        return this.propagatingVgws == null ? Input.empty() : this.propagatingVgws;
    }

    /**
     * Set of objects. Detailed below
     * 
     */
    @InputImport(name="routes")
      private final @Nullable Input<List<DefaultRouteTableRouteArgs>> routes;

    public Input<List<DefaultRouteTableRouteArgs>> getRoutes() {
        return this.routes == null ? Input.empty() : this.routes;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DefaultRouteTableArgs(
        Input<String> defaultRouteTableId,
        @Nullable Input<List<String>> propagatingVgws,
        @Nullable Input<List<DefaultRouteTableRouteArgs>> routes,
        @Nullable Input<Map<String,String>> tags) {
        this.defaultRouteTableId = Objects.requireNonNull(defaultRouteTableId, "expected parameter 'defaultRouteTableId' to be non-null");
        this.propagatingVgws = propagatingVgws;
        this.routes = routes;
        this.tags = tags;
    }

    private DefaultRouteTableArgs() {
        this.defaultRouteTableId = Input.empty();
        this.propagatingVgws = Input.empty();
        this.routes = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> defaultRouteTableId;
        private @Nullable Input<List<String>> propagatingVgws;
        private @Nullable Input<List<DefaultRouteTableRouteArgs>> routes;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteTableId = defaults.defaultRouteTableId;
    	      this.propagatingVgws = defaults.propagatingVgws;
    	      this.routes = defaults.routes;
    	      this.tags = defaults.tags;
        }

        public Builder defaultRouteTableId(Input<String> defaultRouteTableId) {
            this.defaultRouteTableId = Objects.requireNonNull(defaultRouteTableId);
            return this;
        }

        public Builder defaultRouteTableId(String defaultRouteTableId) {
            this.defaultRouteTableId = Input.of(Objects.requireNonNull(defaultRouteTableId));
            return this;
        }

        public Builder propagatingVgws(@Nullable Input<List<String>> propagatingVgws) {
            this.propagatingVgws = propagatingVgws;
            return this;
        }

        public Builder propagatingVgws(@Nullable List<String> propagatingVgws) {
            this.propagatingVgws = Input.ofNullable(propagatingVgws);
            return this;
        }

        public Builder routes(@Nullable Input<List<DefaultRouteTableRouteArgs>> routes) {
            this.routes = routes;
            return this;
        }

        public Builder routes(@Nullable List<DefaultRouteTableRouteArgs> routes) {
            this.routes = Input.ofNullable(routes);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DefaultRouteTableArgs build() {
            return new DefaultRouteTableArgs(defaultRouteTableId, propagatingVgws, routes, tags);
        }
    }
}
