// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.endpoints.inputs.ServiceApiMethodArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceApiArgs extends ResourceArgs {

    public static final ServiceApiArgs Empty = new ServiceApiArgs();

    @Import(name="methods")
    private @Nullable Output<List<ServiceApiMethodArgs>> methods;

    public Optional<Output<List<ServiceApiMethodArgs>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="syntax")
    private @Nullable Output<String> syntax;

    public Optional<Output<String>> syntax() {
        return Optional.ofNullable(this.syntax);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServiceApiArgs() {}

    private ServiceApiArgs(ServiceApiArgs $) {
        this.methods = $.methods;
        this.name = $.name;
        this.syntax = $.syntax;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceApiArgs $;

        public Builder() {
            $ = new ServiceApiArgs();
        }

        public Builder(ServiceApiArgs defaults) {
            $ = new ServiceApiArgs(Objects.requireNonNull(defaults));
        }

        public Builder methods(@Nullable Output<List<ServiceApiMethodArgs>> methods) {
            $.methods = methods;
            return this;
        }

        public Builder methods(List<ServiceApiMethodArgs> methods) {
            return methods(Output.of(methods));
        }

        public Builder methods(ServiceApiMethodArgs... methods) {
            return methods(List.of(methods));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder syntax(@Nullable Output<String> syntax) {
            $.syntax = syntax;
            return this;
        }

        public Builder syntax(String syntax) {
            return syntax(Output.of(syntax));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ServiceApiArgs build() {
            return $;
        }
    }

}
