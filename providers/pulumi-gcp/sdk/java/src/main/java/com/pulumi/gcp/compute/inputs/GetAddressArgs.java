// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAddressArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAddressArgs Empty = new GetAddressArgs();

    /**
     * A unique name for the resource, required by GCE.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Region in which the created address reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetAddressArgs() {}

    private GetAddressArgs(GetAddressArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAddressArgs $;

        public Builder() {
            $ = new GetAddressArgs();
        }

        public Builder(GetAddressArgs defaults) {
            $ = new GetAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetAddressArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
