// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementLabelMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementGetArgs Empty = new WebAclRuleStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
    private @Nullable Output<WebAclRuleStatementAndStatementGetArgs> andStatement;

    public Optional<Output<WebAclRuleStatementAndStatementGetArgs>> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Optional<Output<WebAclRuleStatementByteMatchStatementGetArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Optional<Output<WebAclRuleStatementGeoMatchStatementGetArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementIpSetReferenceStatementGetArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Optional<Output<WebAclRuleStatementLabelMatchStatementGetArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A rule statement used to run the rules that are defined in a managed rule group.  This statement can not be nested. See Managed Rule Group Statement below for details.
     * 
     */
    @Import(name="managedRuleGroupStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementGetArgs> managedRuleGroupStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementGetArgs>> managedRuleGroupStatement() {
        return Optional.ofNullable(this.managedRuleGroupStatement);
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
    private @Nullable Output<WebAclRuleStatementNotStatementGetArgs> notStatement;

    public Optional<Output<WebAclRuleStatementNotStatementGetArgs>> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
    private @Nullable Output<WebAclRuleStatementOrStatementGetArgs> orStatement;

    public Optional<Output<WebAclRuleStatementOrStatementGetArgs>> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }

    /**
     * A rate-based rule tracks the rate of requests for each originating `IP address`, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any `5-minute` time span. This statement can not be nested. See Rate Based Statement below for details.
     * 
     */
    @Import(name="rateBasedStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementGetArgs> rateBasedStatement;

    public Optional<Output<WebAclRuleStatementRateBasedStatementGetArgs>> rateBasedStatement() {
        return Optional.ofNullable(this.rateBasedStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementRegexPatternSetReferenceStatementGetArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement used to run the rules that are defined in an WAFv2 Rule Group. See Rule Group Reference Statement below for details.
     * 
     */
    @Import(name="ruleGroupReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRuleGroupReferenceStatementGetArgs> ruleGroupReferenceStatement;

    public Optional<Output<WebAclRuleStatementRuleGroupReferenceStatementGetArgs>> ruleGroupReferenceStatement() {
        return Optional.ofNullable(this.ruleGroupReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Optional<Output<WebAclRuleStatementSizeConstraintStatementGetArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Optional<Output<WebAclRuleStatementSqliMatchStatementGetArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Optional<Output<WebAclRuleStatementXssMatchStatementGetArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementGetArgs() {}

    private WebAclRuleStatementGetArgs(WebAclRuleStatementGetArgs $) {
        this.andStatement = $.andStatement;
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.managedRuleGroupStatement = $.managedRuleGroupStatement;
        this.notStatement = $.notStatement;
        this.orStatement = $.orStatement;
        this.rateBasedStatement = $.rateBasedStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.ruleGroupReferenceStatement = $.ruleGroupReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementGetArgs();
        }

        public Builder(WebAclRuleStatementGetArgs defaults) {
            $ = new WebAclRuleStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder andStatement(@Nullable Output<WebAclRuleStatementAndStatementGetArgs> andStatement) {
            $.andStatement = andStatement;
            return this;
        }

        public Builder andStatement(WebAclRuleStatementAndStatementGetArgs andStatement) {
            return andStatement(Output.of(andStatement));
        }

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementByteMatchStatementGetArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(WebAclRuleStatementByteMatchStatementGetArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(WebAclRuleStatementGeoMatchStatementGetArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(WebAclRuleStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(WebAclRuleStatementLabelMatchStatementGetArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        public Builder managedRuleGroupStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementGetArgs> managedRuleGroupStatement) {
            $.managedRuleGroupStatement = managedRuleGroupStatement;
            return this;
        }

        public Builder managedRuleGroupStatement(WebAclRuleStatementManagedRuleGroupStatementGetArgs managedRuleGroupStatement) {
            return managedRuleGroupStatement(Output.of(managedRuleGroupStatement));
        }

        public Builder notStatement(@Nullable Output<WebAclRuleStatementNotStatementGetArgs> notStatement) {
            $.notStatement = notStatement;
            return this;
        }

        public Builder notStatement(WebAclRuleStatementNotStatementGetArgs notStatement) {
            return notStatement(Output.of(notStatement));
        }

        public Builder orStatement(@Nullable Output<WebAclRuleStatementOrStatementGetArgs> orStatement) {
            $.orStatement = orStatement;
            return this;
        }

        public Builder orStatement(WebAclRuleStatementOrStatementGetArgs orStatement) {
            return orStatement(Output.of(orStatement));
        }

        public Builder rateBasedStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementGetArgs> rateBasedStatement) {
            $.rateBasedStatement = rateBasedStatement;
            return this;
        }

        public Builder rateBasedStatement(WebAclRuleStatementRateBasedStatementGetArgs rateBasedStatement) {
            return rateBasedStatement(Output.of(rateBasedStatement));
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        public Builder ruleGroupReferenceStatement(@Nullable Output<WebAclRuleStatementRuleGroupReferenceStatementGetArgs> ruleGroupReferenceStatement) {
            $.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
            return this;
        }

        public Builder ruleGroupReferenceStatement(WebAclRuleStatementRuleGroupReferenceStatementGetArgs ruleGroupReferenceStatement) {
            return ruleGroupReferenceStatement(Output.of(ruleGroupReferenceStatement));
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(WebAclRuleStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(WebAclRuleStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementXssMatchStatementGetArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(WebAclRuleStatementXssMatchStatementGetArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementGetArgs build() {
            return $;
        }
    }

}
