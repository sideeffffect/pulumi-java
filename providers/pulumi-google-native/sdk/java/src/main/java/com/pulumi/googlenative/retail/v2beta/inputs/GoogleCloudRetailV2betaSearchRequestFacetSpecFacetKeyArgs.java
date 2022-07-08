// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail.v2beta.inputs.GoogleCloudRetailV2betaIntervalArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how a facet is computed.
 * 
 */
public final class GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs Empty = new GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs();

    /**
     * True to make facet keys case insensitive when getting faceting values with prefixes or contains; false otherwise.
     * 
     */
    @Import(name="caseInsensitive")
    private @Nullable Output<Boolean> caseInsensitive;

    /**
     * @return True to make facet keys case insensitive when getting faceting values with prefixes or contains; false otherwise.
     * 
     */
    public Optional<Output<Boolean>> caseInsensitive() {
        return Optional.ofNullable(this.caseInsensitive);
    }

    /**
     * Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    @Import(name="contains")
    private @Nullable Output<List<String>> contains;

    /**
     * @return Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    public Optional<Output<List<String>>> contains() {
        return Optional.ofNullable(this.contains);
    }

    /**
     * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    @Import(name="intervals")
    private @Nullable Output<List<GoogleCloudRetailV2betaIntervalArgs>> intervals;

    /**
     * @return Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    public Optional<Output<List<GoogleCloudRetailV2betaIntervalArgs>>> intervals() {
        return Optional.ofNullable(this.intervals);
    }

    /**
     * Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    /**
     * @return The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    /**
     * Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    @Import(name="prefixes")
    private @Nullable Output<List<String>> prefixes;

    /**
     * @return Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    public Optional<Output<List<String>>> prefixes() {
        return Optional.ofNullable(this.prefixes);
    }

    /**
     * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on predefined textual fields, custom textual attributes and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    @Import(name="restrictedValues")
    private @Nullable Output<List<String>> restrictedValues;

    /**
     * @return Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on predefined textual fields, custom textual attributes and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    public Optional<Output<List<String>>> restrictedValues() {
        return Optional.ofNullable(this.restrictedValues);
    }

    private GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs() {}

    private GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs $) {
        this.caseInsensitive = $.caseInsensitive;
        this.contains = $.contains;
        this.intervals = $.intervals;
        this.key = $.key;
        this.orderBy = $.orderBy;
        this.prefixes = $.prefixes;
        this.query = $.query;
        this.restrictedValues = $.restrictedValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs();
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs defaults) {
            $ = new GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caseInsensitive True to make facet keys case insensitive when getting faceting values with prefixes or contains; false otherwise.
         * 
         * @return builder
         * 
         */
        public Builder caseInsensitive(@Nullable Output<Boolean> caseInsensitive) {
            $.caseInsensitive = caseInsensitive;
            return this;
        }

        /**
         * @param caseInsensitive True to make facet keys case insensitive when getting faceting values with prefixes or contains; false otherwise.
         * 
         * @return builder
         * 
         */
        public Builder caseInsensitive(Boolean caseInsensitive) {
            return caseInsensitive(Output.of(caseInsensitive));
        }

        /**
         * @param contains Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
         * 
         * @return builder
         * 
         */
        public Builder contains(@Nullable Output<List<String>> contains) {
            $.contains = contains;
            return this;
        }

        /**
         * @param contains Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
         * 
         * @return builder
         * 
         */
        public Builder contains(List<String> contains) {
            return contains(Output.of(contains));
        }

        /**
         * @param contains Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
         * 
         * @return builder
         * 
         */
        public Builder contains(String... contains) {
            return contains(List.of(contains));
        }

        /**
         * @param intervals Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
         * 
         * @return builder
         * 
         */
        public Builder intervals(@Nullable Output<List<GoogleCloudRetailV2betaIntervalArgs>> intervals) {
            $.intervals = intervals;
            return this;
        }

        /**
         * @param intervals Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
         * 
         * @return builder
         * 
         */
        public Builder intervals(List<GoogleCloudRetailV2betaIntervalArgs> intervals) {
            return intervals(Output.of(intervals));
        }

        /**
         * @param intervals Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
         * 
         * @return builder
         * 
         */
        public Builder intervals(GoogleCloudRetailV2betaIntervalArgs... intervals) {
            return intervals(List.of(intervals));
        }

        /**
         * @param key Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param orderBy The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param orderBy The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        /**
         * @param prefixes Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
         * 
         * @return builder
         * 
         */
        public Builder prefixes(@Nullable Output<List<String>> prefixes) {
            $.prefixes = prefixes;
            return this;
        }

        /**
         * @param prefixes Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
         * 
         * @return builder
         * 
         */
        public Builder prefixes(List<String> prefixes) {
            return prefixes(Output.of(prefixes));
        }

        /**
         * @param prefixes Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
         * 
         * @return builder
         * 
         */
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }

        /**
         * @param query The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param restrictedValues Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on predefined textual fields, custom textual attributes and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
         * 
         * @return builder
         * 
         */
        public Builder restrictedValues(@Nullable Output<List<String>> restrictedValues) {
            $.restrictedValues = restrictedValues;
            return this;
        }

        /**
         * @param restrictedValues Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on predefined textual fields, custom textual attributes and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
         * 
         * @return builder
         * 
         */
        public Builder restrictedValues(List<String> restrictedValues) {
            return restrictedValues(Output.of(restrictedValues));
        }

        /**
         * @param restrictedValues Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on predefined textual fields, custom textual attributes and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
         * 
         * @return builder
         * 
         */
        public Builder restrictedValues(String... restrictedValues) {
            return restrictedValues(List.of(restrictedValues));
        }

        public GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
