// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolDomainArgs Empty = new UserPoolDomainArgs();

    /**
     * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * The domain string.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The user pool ID.
     * 
     */
    @Import(name="userPoolId", required=true)
    private Output<String> userPoolId;

    public Output<String> userPoolId() {
        return this.userPoolId;
    }

    private UserPoolDomainArgs() {}

    private UserPoolDomainArgs(UserPoolDomainArgs $) {
        this.certificateArn = $.certificateArn;
        this.domain = $.domain;
        this.userPoolId = $.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolDomainArgs $;

        public Builder() {
            $ = new UserPoolDomainArgs();
        }

        public Builder(UserPoolDomainArgs defaults) {
            $ = new UserPoolDomainArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder userPoolId(Output<String> userPoolId) {
            $.userPoolId = userPoolId;
            return this;
        }

        public Builder userPoolId(String userPoolId) {
            return userPoolId(Output.of(userPoolId));
        }

        public UserPoolDomainArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.userPoolId = Objects.requireNonNull($.userPoolId, "expected parameter 'userPoolId' to be non-null");
            return $;
        }
    }

}
