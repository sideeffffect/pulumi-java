// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appsync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDomainNameApiAssociationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainNameApiAssociationPlainArgs Empty = new GetDomainNameApiAssociationPlainArgs();

    @Import(name="apiAssociationIdentifier", required=true)
    private String apiAssociationIdentifier;

    public String apiAssociationIdentifier() {
        return this.apiAssociationIdentifier;
    }

    private GetDomainNameApiAssociationPlainArgs() {}

    private GetDomainNameApiAssociationPlainArgs(GetDomainNameApiAssociationPlainArgs $) {
        this.apiAssociationIdentifier = $.apiAssociationIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainNameApiAssociationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainNameApiAssociationPlainArgs $;

        public Builder() {
            $ = new GetDomainNameApiAssociationPlainArgs();
        }

        public Builder(GetDomainNameApiAssociationPlainArgs defaults) {
            $ = new GetDomainNameApiAssociationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiAssociationIdentifier(String apiAssociationIdentifier) {
            $.apiAssociationIdentifier = apiAssociationIdentifier;
            return this;
        }

        public GetDomainNameApiAssociationPlainArgs build() {
            $.apiAssociationIdentifier = Objects.requireNonNull($.apiAssociationIdentifier, "expected parameter 'apiAssociationIdentifier' to be non-null");
            return $;
        }
    }

}
