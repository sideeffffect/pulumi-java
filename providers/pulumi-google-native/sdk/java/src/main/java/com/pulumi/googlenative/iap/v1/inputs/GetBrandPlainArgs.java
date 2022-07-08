// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iap.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBrandPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBrandPlainArgs Empty = new GetBrandPlainArgs();

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

    private GetBrandPlainArgs() {}

    private GetBrandPlainArgs(GetBrandPlainArgs $) {
        this.brandId = $.brandId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBrandPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBrandPlainArgs $;

        public Builder() {
            $ = new GetBrandPlainArgs();
        }

        public Builder(GetBrandPlainArgs defaults) {
            $ = new GetBrandPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder brandId(String brandId) {
            $.brandId = brandId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBrandPlainArgs build() {
            $.brandId = Objects.requireNonNull($.brandId, "expected parameter 'brandId' to be non-null");
            return $;
        }
    }

}
