// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServingConfigPlainArgs Empty = new GetServingConfigPlainArgs();

    @Import(name="catalogId", required=true)
    private String catalogId;

    public String catalogId() {
        return this.catalogId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="servingConfigId", required=true)
    private String servingConfigId;

    public String servingConfigId() {
        return this.servingConfigId;
    }

    private GetServingConfigPlainArgs() {}

    private GetServingConfigPlainArgs(GetServingConfigPlainArgs $) {
        this.catalogId = $.catalogId;
        this.location = $.location;
        this.project = $.project;
        this.servingConfigId = $.servingConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingConfigPlainArgs $;

        public Builder() {
            $ = new GetServingConfigPlainArgs();
        }

        public Builder(GetServingConfigPlainArgs defaults) {
            $ = new GetServingConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder servingConfigId(String servingConfigId) {
            $.servingConfigId = servingConfigId;
            return this;
        }

        public GetServingConfigPlainArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.servingConfigId = Objects.requireNonNull($.servingConfigId, "expected parameter 'servingConfigId' to be non-null");
            return $;
        }
    }

}
