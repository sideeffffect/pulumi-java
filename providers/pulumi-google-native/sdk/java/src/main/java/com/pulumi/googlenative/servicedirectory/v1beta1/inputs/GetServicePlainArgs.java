// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePlainArgs Empty = new GetServicePlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="namespaceId", required=true)
    private String namespaceId;

    public String namespaceId() {
        return this.namespaceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    private GetServicePlainArgs() {}

    private GetServicePlainArgs(GetServicePlainArgs $) {
        this.location = $.location;
        this.namespaceId = $.namespaceId;
        this.project = $.project;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePlainArgs $;

        public Builder() {
            $ = new GetServicePlainArgs();
        }

        public Builder(GetServicePlainArgs defaults) {
            $ = new GetServicePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public GetServicePlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
