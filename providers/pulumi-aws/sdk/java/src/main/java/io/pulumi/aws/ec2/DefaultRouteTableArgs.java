// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="defaultRouteTableId", required=true)
      private final Output<String> defaultRouteTableId;

    public Output<String> defaultRouteTableId() {
        return this.defaultRouteTableId;
    }

    /**
     * List of virtual gateways for propagation.
     * 
     */
    @Import(name="propagatingVgws")
      private final @Nullable Output<List<String>> propagatingVgws;

    public Output<List<String>> propagatingVgws() {
        return this.propagatingVgws == null ? Codegen.empty() : this.propagatingVgws;
    }

    /**
     * Set of objects. Detailed below
     * 
     */
    @Import(name="routes")
      private final @Nullable Output<List<DefaultRouteTableRouteArgs>> routes;

    public Output<List<DefaultRouteTableRouteArgs>> routes() {
        return this.routes == null ? Codegen.empty() : this.routes;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DefaultRouteTableArgs(
        Output<String> defaultRouteTableId,
        @Nullable Output<List<String>> propagatingVgws,
        @Nullable Output<List<DefaultRouteTableRouteArgs>> routes,
        @Nullable Output<Map<String,String>> tags) {
        this.defaultRouteTableId = Objects.requireNonNull(defaultRouteTableId, "expected parameter 'defaultRouteTableId' to be non-null");
        this.propagatingVgws = propagatingVgws;
        this.routes = routes;
        this.tags = tags;
    }

    private DefaultRouteTableArgs() {
        this.defaultRouteTableId = Codegen.empty();
        this.propagatingVgws = Codegen.empty();
        this.routes = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> defaultRouteTableId;
        private @Nullable Output<List<String>> propagatingVgws;
        private @Nullable Output<List<DefaultRouteTableRouteArgs>> routes;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder defaultRouteTableId(Output<String> defaultRouteTableId) {
            this.defaultRouteTableId = Objects.requireNonNull(defaultRouteTableId);
            return this;
        }
        public Builder defaultRouteTableId(String defaultRouteTableId) {
            this.defaultRouteTableId = Output.of(Objects.requireNonNull(defaultRouteTableId));
            return this;
        }
        public Builder propagatingVgws(@Nullable Output<List<String>> propagatingVgws) {
            this.propagatingVgws = propagatingVgws;
            return this;
        }
        public Builder propagatingVgws(@Nullable List<String> propagatingVgws) {
            this.propagatingVgws = Codegen.ofNullable(propagatingVgws);
            return this;
        }
        public Builder propagatingVgws(String... propagatingVgws) {
            return propagatingVgws(List.of(propagatingVgws));
        }
        public Builder routes(@Nullable Output<List<DefaultRouteTableRouteArgs>> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(@Nullable List<DefaultRouteTableRouteArgs> routes) {
            this.routes = Codegen.ofNullable(routes);
            return this;
        }
        public Builder routes(DefaultRouteTableRouteArgs... routes) {
            return routes(List.of(routes));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DefaultRouteTableArgs build() {
            return new DefaultRouteTableArgs(defaultRouteTableId, propagatingVgws, routes, tags);
        }
    }
}
