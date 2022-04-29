// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetGrantArgs extends InvokeArgs {

    public static final GetGrantArgs Empty = new GetGrantArgs();

    /**
     * Arn of the grant.
     * 
     */
    @Import(name="grantArn", required=true)
    private String grantArn;

    /**
     * @return Arn of the grant.
     * 
     */
    public String grantArn() {
        return this.grantArn;
    }

    private GetGrantArgs() {}

    private GetGrantArgs(GetGrantArgs $) {
        this.grantArn = $.grantArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGrantArgs $;

        public Builder() {
            $ = new GetGrantArgs();
        }

        public Builder(GetGrantArgs defaults) {
            $ = new GetGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param grantArn Arn of the grant.
         * 
         * @return builder
         * 
         */
        public Builder grantArn(String grantArn) {
            $.grantArn = grantArn;
            return this;
        }

        public GetGrantArgs build() {
            $.grantArn = Objects.requireNonNull($.grantArn, "expected parameter 'grantArn' to be non-null");
            return $;
        }
    }

}
