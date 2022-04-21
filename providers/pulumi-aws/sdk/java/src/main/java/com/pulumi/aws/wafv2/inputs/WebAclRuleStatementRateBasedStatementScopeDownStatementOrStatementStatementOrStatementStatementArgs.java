// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs $) {
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs build() {
            return $;
        }
    }

}
