// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalogappregistry.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetApplicationArgs() {}

    private GetApplicationArgs(GetApplicationArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationArgs $;

        public Builder() {
            $ = new GetApplicationArgs();
        }

        public Builder(GetApplicationArgs defaults) {
            $ = new GetApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetApplicationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
