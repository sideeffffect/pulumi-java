// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * AML Token identity configuration.
 * 
 */
public final class AmlTokenResponse extends com.pulumi.resources.InvokeArgs {

    public static final AmlTokenResponse Empty = new AmlTokenResponse();

    /**
     * Enum to determine identity framework.
     * Expected value is &#39;AMLToken&#39;.
     * 
     */
    @Import(name="identityType", required=true)
    private String identityType;

    public String identityType() {
        return this.identityType;
    }

    private AmlTokenResponse() {}

    private AmlTokenResponse(AmlTokenResponse $) {
        this.identityType = $.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmlTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmlTokenResponse $;

        public Builder() {
            $ = new AmlTokenResponse();
        }

        public Builder(AmlTokenResponse defaults) {
            $ = new AmlTokenResponse(Objects.requireNonNull(defaults));
        }

        public Builder identityType(String identityType) {
            $.identityType = identityType;
            return this;
        }

        public AmlTokenResponse build() {
            $.identityType = Codegen.stringProp("identityType").arg($.identityType).require();
            return $;
        }
    }

}
