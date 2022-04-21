// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalogappregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAttributeGroupAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttributeGroupAssociationArgs Empty = new GetAttributeGroupAssociationArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetAttributeGroupAssociationArgs() {}

    private GetAttributeGroupAssociationArgs(GetAttributeGroupAssociationArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttributeGroupAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttributeGroupAssociationArgs $;

        public Builder() {
            $ = new GetAttributeGroupAssociationArgs();
        }

        public Builder(GetAttributeGroupAssociationArgs defaults) {
            $ = new GetAttributeGroupAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAttributeGroupAssociationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
