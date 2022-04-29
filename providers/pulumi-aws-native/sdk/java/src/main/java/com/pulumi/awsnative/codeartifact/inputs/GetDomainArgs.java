// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDomainArgs extends InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    /**
     * The ARN of the domain.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The ARN of the domain.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetDomainArgs() {}

    private GetDomainArgs(GetDomainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainArgs $;

        public Builder() {
            $ = new GetDomainArgs();
        }

        public Builder(GetDomainArgs defaults) {
            $ = new GetDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the domain.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetDomainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
