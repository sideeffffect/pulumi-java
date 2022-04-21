// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementGetArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementGetArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementGetArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs() {}

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs(RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs $) {
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
    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs();
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs defaults) {
            $ = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder byteMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        public Builder geoMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        public Builder ipSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        public Builder labelMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        public Builder sizeConstraintStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        public Builder sqliMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        public Builder xssMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementGetArgs build() {
            return $;
        }
    }

}
