// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAzsArgs extends InvokeArgs {

    public static final GetAzsArgs Empty = new GetAzsArgs();

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetAzsArgs() {}

    private GetAzsArgs(GetAzsArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzsArgs $;

        public Builder() {
            $ = new GetAzsArgs();
        }

        public Builder(GetAzsArgs defaults) {
            $ = new GetAzsArgs(Objects.requireNonNull(defaults));
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetAzsArgs build() {
            return $;
        }
    }

}
