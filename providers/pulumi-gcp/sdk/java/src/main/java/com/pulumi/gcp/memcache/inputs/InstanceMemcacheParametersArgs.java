// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceMemcacheParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMemcacheParametersArgs Empty = new InstanceMemcacheParametersArgs();

    /**
     * - 
     * This is a unique ID associated with this set of parameters.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * User-defined set of parameters to use in the memcache process.
     * 
     */
    @Import(name="params")
    private @Nullable Output<Map<String,String>> params;

    public Optional<Output<Map<String,String>>> params() {
        return Optional.ofNullable(this.params);
    }

    private InstanceMemcacheParametersArgs() {}

    private InstanceMemcacheParametersArgs(InstanceMemcacheParametersArgs $) {
        this.id = $.id;
        this.params = $.params;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMemcacheParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMemcacheParametersArgs $;

        public Builder() {
            $ = new InstanceMemcacheParametersArgs();
        }

        public Builder(InstanceMemcacheParametersArgs defaults) {
            $ = new InstanceMemcacheParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder params(@Nullable Output<Map<String,String>> params) {
            $.params = params;
            return this;
        }

        public Builder params(Map<String,String> params) {
            return params(Output.of(params));
        }

        public InstanceMemcacheParametersArgs build() {
            return $;
        }
    }

}
