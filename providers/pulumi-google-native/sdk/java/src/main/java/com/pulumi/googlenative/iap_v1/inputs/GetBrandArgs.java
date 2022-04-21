// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iap_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBrandArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBrandArgs Empty = new GetBrandArgs();

    @Import(name="brandId", required=true)
    private String brandId;

    public String brandId() {
        return this.brandId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBrandArgs() {}

    private GetBrandArgs(GetBrandArgs $) {
        this.brandId = $.brandId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBrandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBrandArgs $;

        public Builder() {
            $ = new GetBrandArgs();
        }

        public Builder(GetBrandArgs defaults) {
            $ = new GetBrandArgs(Objects.requireNonNull(defaults));
        }

        public Builder brandId(String brandId) {
            $.brandId = brandId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBrandArgs build() {
            $.brandId = Objects.requireNonNull($.brandId, "expected parameter 'brandId' to be non-null");
            return $;
        }
    }

}
