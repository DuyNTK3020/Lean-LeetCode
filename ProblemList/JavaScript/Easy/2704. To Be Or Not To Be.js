/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    const error = (msg) => {throw new Error(msg)}
    return {
        toBe : (value) => val === value || error("Not Equal"),
        notToBe: (value) => val !== value || error("Equal")
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */

/**
 * Trong js không dùng được throw new Error(msg) trực tiếp với toán tử 3 ngôi
 * Phải return lại hàm được sử dụng
 */