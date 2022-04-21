// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalogappregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAttributeGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttributeGroupArgs Empty = new GetAttributeGroupArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetAttributeGroupArgs() {}

    private GetAttributeGroupArgs(GetAttributeGroupArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttributeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttributeGroupArgs $;

        public Builder() {
            $ = new GetAttributeGroupArgs();
        }

        public Builder(GetAttributeGroupArgs defaults) {
            $ = new GetAttributeGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAttributeGroupArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
