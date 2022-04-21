// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementArgs> andStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementArgs>> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs> notStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs>> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementArgs> orStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementArgs>> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementAndStatementStatementArgs(WebAclRuleStatementAndStatementStatementAndStatementStatementArgs $) {
        this.andStatement = $.andStatement;
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.notStatement = $.notStatement;
        this.orStatement = $.orStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementAndStatementStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder andStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementArgs> andStatement) {
            $.andStatement = andStatement;
            return this;
        }

        public Builder andStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementArgs andStatement) {
            return andStatement(Output.of(andStatement));
        }

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        public Builder notStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs> notStatement) {
            $.notStatement = notStatement;
            return this;
        }

        public Builder notStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs notStatement) {
            return notStatement(Output.of(notStatement));
        }

        public Builder orStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementArgs> orStatement) {
            $.orStatement = orStatement;
            return this;
        }

        public Builder orStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementArgs orStatement) {
            return orStatement(Output.of(orStatement));
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementAndStatementStatementAndStatementStatementArgs build() {
            return $;
        }
    }

}
